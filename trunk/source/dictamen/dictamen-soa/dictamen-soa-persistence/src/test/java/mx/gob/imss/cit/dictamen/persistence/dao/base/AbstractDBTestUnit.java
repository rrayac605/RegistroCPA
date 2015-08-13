package mx.gob.imss.cit.dictamen.persistence.dao.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import mx.gob.imss.cit.dictamen.commons.util.ReflectionHelper;
import mx.gob.imss.cit.dictamen.persistence.dao.*;
import mx.gob.imss.cit.dictamen.persistence.dao.impl.*;

import org.junit.After;
import org.junit.Before;

/**
 * Clase de prueba unitaria de la que deben extender los
 * 
 * @author ajfuentes
 */
public abstract class AbstractDBTestUnit
{

  public Map<Class<?>, Class<?>> mapDAO;
  
  private EntityManager em;

  @Before
  public void setUp()
  {
	  Properties prop = new Properties();
	  try {
		prop.load(AbstractDBTestUnit.class.getClassLoader().getResourceAsStream("db_embedida.properties"));
	} catch (IOException e) {
	
		e.printStackTrace();
	}
	
    if( em == null )
    {

      EntityManagerFactory emf = Persistence.createEntityManagerFactory( "DictamenPUTest" );
      em = emf.createEntityManager();
      // Agregar la relación de daos y sus implementaciones
      initMapDAO();

      if( !em.getTransaction().isActive() ) {
        em.getTransaction().begin();
      }
      
      if("true".equals(prop.getProperty("db_embedida"))){
    	  initializeData( "dataset/init.sql" );
      }
     
    }
  }

  public void initializeData( String path )
  {
    

    InputStream is = ClassLoader.getSystemResourceAsStream( path );
    InputStreamReader isr = new InputStreamReader( is );
    BufferedReader br = new BufferedReader( isr );

    String line;
    Query query = null;
    try
    {
      line = br.readLine();
      while( line != null )
      {
        if( line.length() > 20 && line.indexOf( "//" ) != 0 )
        {
          query = em.createNativeQuery( line );
          query.executeUpdate();
          em.flush();
        }
        line = br.readLine();
      }
    }
    catch( IOException e )
    {
      e.printStackTrace();
    }
    finally
    {
      safeCloseBufferedReader( br );
    }
  }

  private void safeCloseBufferedReader( BufferedReader br )
  {
    if( br != null )
    {
      try
      {
        br.close();
      }
      catch( IOException e )
      {
        br = null;
      }
    }
  }

  private void initMapDAO()
  {
    // Agregar las relaciones de DAO y sus implementaciones
    mapDAO = new HashMap<Class<?>, Class<?>>();
	mapDAO.put( DgAsentamientoDAO.class						,DgAsentamientoDAOImpl.class);
	mapDAO.put( DgCatAdministracionDAO.class                ,DgCatAdministracionDAOImpl.class);
	mapDAO.put( DgCatAmbitoDAO.class                        ,DgCatAmbitoDAOImpl.class);
	mapDAO.put( DgCatDerechosTransitoDAO.class              ,DgCatDerechosTransitoDAOImpl.class);
	mapDAO.put( DgCatEstadoCpDAO.class                      ,DgCatEstadoCpDAOImpl.class);
	mapDAO.put( DgCatEstadoDAO.class                        ,DgCatEstadoDAOImpl.class);
	mapDAO.put( DgCatLocalidadDAO.class	                    ,DgCatLocalidadDAOImpl.class);	
	mapDAO.put( DgCatMargenDAO.class                        ,DgCatMargenDAOImpl.class);
	mapDAO.put( DgCatMunicipioDAO.class                     ,DgCatMunicipioDAOImpl.class);
	mapDAO.put( DgCatPeriodoDAO.class                       ,DgCatPeriodoDAOImpl.class);
	mapDAO.put( DgCatTermGenDAO.class                       ,DgCatTermGenDAOImpl.class);
	mapDAO.put( DgCatTipoAsenDAO.class                      ,DgCatTipoAsenDAOImpl.class);
	mapDAO.put( DgCatTipoDomDAO.class                       ,DgCatTipoDomDAOImpl.class);
	mapDAO.put( DgCatVialidadDAO.class                      ,DgCatVialidadDAOImpl.class);
	mapDAO.put( DgCodigosPostalesDAO.class	                ,DgCodigosPostalesDAOImpl.class);	
	mapDAO.put( DgDomicilioGeograficoDAO.class              ,DgDomicilioGeograficoDAOImpl.class);
	mapDAO.put( DgDomiciliosCaminosDAO.class                ,DgDomiciliosCaminosDAOImpl.class);
	mapDAO.put( DgDomiciliosCarreterasDAO.class             ,DgDomiciliosCarreterasDAOImpl.class);
	mapDAO.put( DgVialidadDAO.class                         ,DgVialidadDAOImpl.class);
	mapDAO.put( DicCalidadCaracMigratDAO.class              ,DicCalidadCaracMigratDAOImpl.class);
	mapDAO.put( DicDelegacionDAO.class                      ,DicDelegacionDAOImpl.class);
	mapDAO.put( DicDocumentoDAO.class                       ,DicDocumentoDAOImpl.class);
	mapDAO.put( DicEstadoCivilDAO.class		                ,DicEstadoCivilDAOImpl.class);		
	mapDAO.put( DicEstadoSolicitudDAO.class                 ,DicEstadoSolicitudDAOImpl.class);
	mapDAO.put( DicEstadoTramiteDAO.class                   ,DicEstadoTramiteDAOImpl.class);
	mapDAO.put( DicModuloDAO.class                          ,DicModuloDAOImpl.class);
	mapDAO.put( DicPaisDAO.class                            ,DicPaisDAOImpl.class);
	mapDAO.put( DicSexoDAO.class                            ,DicSexoDAOImpl.class);
	mapDAO.put( DicSubdelegacionDAO.class                   ,DicSubdelegacionDAOImpl.class);
	mapDAO.put( DicTipoDocumentoProbatorioDAO.class         ,DicTipoDocumentoProbatorioDAOImpl.class);
	mapDAO.put( DicTipoFormaDAO.class                       ,DicTipoFormaDAOImpl.class);
	mapDAO.put( DicTipoSociedadDAO.class	                ,DicTipoSociedadDAOImpl.class);	
	mapDAO.put( DicTipoSolicitudDAO.class                   ,DicTipoSolicitudDAOImpl.class);
	mapDAO.put( DicTipoTramiteDAO.class                     ,DicTipoTramiteDAOImpl.class);
	mapDAO.put( DitActaConstitutivaDAO.class                ,DitActaConstitutivaDAOImpl.class);
	mapDAO.put( DitDatosCertificadoFielDAO.class            ,DitDatosCertificadoFielDAOImpl.class);
	mapDAO.put( DitDatosPersonaSatDAO.class                 ,DitDatosPersonaSatDAOImpl.class);
	mapDAO.put( DitDocumentoPorTipoDAO.class                ,DitDocumentoPorTipoDAOImpl.class);
	mapDAO.put( DitDomicilioSatDAO.class                    ,DitDomicilioSatDAOImpl.class);
	mapDAO.put( DitFormaContactoDAO.class                   ,DitFormaContactoDAOImpl.class);
	mapDAO.put( DitFormaMigratoriaDAO.class		            ,DitFormaMigratoriaDAOImpl.class);		
	mapDAO.put( DitHistEstadoPersonaMoralDAO.class          ,DitHistEstadoPersonaMoralDAOImpl.class);
	mapDAO.put( DitIdentificadorMoralDAO.class              ,DitIdentificadorMoralDAOImpl.class);
	mapDAO.put( DitPatronGeneralDAO.class                   ,DitPatronGeneralDAOImpl.class);
	mapDAO.put( DitPatronSujetoObligadoDAO.class            ,DitPatronSujetoObligadoDAOImpl.class);
	mapDAO.put( DitPersonaDefuncionDAO.class                ,DitPersonaDefuncionDAOImpl.class);
	mapDAO.put( DitPersonaDAO.class                         ,DitPersonaDAOImpl.class);
	mapDAO.put( DitPersonaDomExtranjeroDAO.class            ,DitPersonaDomExtranjeroDAOImpl.class);
	mapDAO.put( DitPersonafContactoDAO.class                ,DitPersonafContactoDAOImpl.class);
	mapDAO.put( DitPersonafDomDAO.class                     ,DitPersonafDomDAOImpl.class);
	mapDAO.put( DitPersonafDomFiscalDAO.class               ,DitPersonafDomFiscalDAOImpl.class);
	mapDAO.put( DitPersonaFisicaDAO.class                   ,DitPersonaFisicaDAOImpl.class);
	mapDAO.put( DitPersonamContactoDAO.class                ,DitPersonamContactoDAOImpl.class);
	mapDAO.put( DitPersonamContactoFiscalDAO.class          ,DitPersonamContactoFiscalDAOImpl.class);
	mapDAO.put( DitPersonamDomDAO.class                     ,DitPersonamDomDAOImpl.class);
	mapDAO.put( DitPersonamDomFiscalDAO.class               ,DitPersonamDomFiscalDAOImpl.class);
	mapDAO.put( DitPersonaMoralDAO.class		            ,DitPersonaMoralDAOImpl.class);		
	mapDAO.put( DitRepresentanteLegalDAO.class              ,DitRepresentanteLegalDAOImpl.class);
	mapDAO.put( DitSindicatoDAO.class                       ,DitSindicatoDAOImpl.class);
	mapDAO.put( DitSituacionSatDAO.class                    ,DitSituacionSatDAOImpl.class);
	mapDAO.put( DitSocioDAO.class                           ,DitSocioDAOImpl.class);
	mapDAO.put( DitSolicitudDAO.class                       ,DitSolicitudDAOImpl.class);
	mapDAO.put( DitTipoContactoDAO.class                    ,DitTipoContactoDAOImpl.class);
	mapDAO.put( DitTramiteDAO.class                         ,DitTramiteDAOImpl.class);
	mapDAO.put( NdcAsociacionDAO.class                      ,NdcAsociacionDAOImpl.class);
	mapDAO.put( NdcColegioDAO.class	                        ,NdcColegioDAOImpl.class);	
	mapDAO.put( NdcDespachoDAO.class                        ,NdcDespachoDAOImpl.class);
	mapDAO.put( NdcEstadoCpaDAO.class                       ,NdcEstadoCpaDAOImpl.class);
	mapDAO.put( NdcOrigenContactoDAO.class                  ,NdcOrigenContactoDAOImpl.class);
	mapDAO.put( NdcTipoAfiliacionDAO.class                  ,NdcTipoAfiliacionDAOImpl.class);
	mapDAO.put( NdcTipoConvenioCotizacionDAO.class          ,NdcTipoConvenioCotizacionDAOImpl.class);
	mapDAO.put( NdcTipoSancionDAO.class                     ,NdcTipoSancionDAOImpl.class);
	mapDAO.put( NdtAcreditacionDAO.class                    ,NdtAcreditacionDAOImpl.class);
	mapDAO.put( NdtAsociacionContactoDAO.class              ,NdtAsociacionContactoDAOImpl.class);
	mapDAO.put( NdtAsociacionDAO.class		                ,NdtAsociacionDAOImpl.class);		
	mapDAO.put( NdtColegioContactoDAO.class                 ,NdtColegioContactoDAOImpl.class);
	mapDAO.put( NdtColegioContadorDAO.class                 ,NdtColegioContadorDAOImpl.class);
	mapDAO.put( NdtContadorPublicoAutDAO.class              ,NdtContadorPublicoAutDAOImpl.class);
	mapDAO.put( NdtDespachoContactoDAO.class                ,NdtDespachoContactoDAOImpl.class);
	mapDAO.put( NdtDoctosProbCpaDAO.class                   ,NdtDoctosProbCpaDAOImpl.class);
	mapDAO.put( NdtPatronDictamenCpaDAO.class               ,NdtPatronDictamenCpaDAOImpl.class);
	mapDAO.put( NdtPatronDictamenDAO.class                  ,NdtPatronDictamenDAOImpl.class);
	mapDAO.put( NdtR1DatosPersonaleDAO.class                ,NdtR1DatosPersonaleDAOImpl.class);
	mapDAO.put( NdtR1DomFiscalDAO.class	                    ,NdtR1DomFiscalDAOImpl.class);	
	mapDAO.put( NdtR2DespachoDAO.class	                    ,NdtR2DespachoDAOImpl.class);	
	mapDAO.put( NdtR3ColegioXcontadorDAO.class              ,NdtR3ColegioXcontadorDAOImpl.class);
	mapDAO.put( NdtRegBajaReactivDAO.class	                ,NdtRegBajaReactivDAOImpl.class);	
	mapDAO.put( NdtTipFormaContactoDAO.class	            ,NdtTipFormaContactoDAOImpl.class);	
    
  }

  protected void connect( Object o )
  {
    connect( o, 3 );
  }

  protected void connect( Object o, int n )
  {
    if( n > 0 )
    {
      try
      {

        Field[] fields = o.getClass().getDeclaredFields();

        for( Field field : fields )
        {
          PersistenceContext persistenceContext = field.getAnnotation( PersistenceContext.class );
          if( persistenceContext != null )
          {
            ReflectionHelper.set( this.em, field.getName(), o );
          }

          EJB ejb = field.getAnnotation( javax.ejb.EJB.class );
          if( ejb != null )
          {
            String className = field.getType().getCanonicalName();

            Class<?> clazz = Class.forName( className );

            if( this.mapDAO.containsKey( clazz ) )
            {
              Constructor<?> ctor = this.mapDAO.get( clazz ).getConstructor();
              Object dao = ctor.newInstance();

              Field[] fieldDAOs = dao.getClass().getDeclaredFields();
              for( Field fieldDAO : fieldDAOs )
              {
                persistenceContext = fieldDAO.getAnnotation( PersistenceContext.class );
                if( persistenceContext != null )
                {
                  ReflectionHelper.set( this.em, fieldDAO.getName(), dao );
                  ReflectionHelper.set( dao, field.getName(), o );
                  break;
                }
              }
              connect( dao, n - 1 );
            }

          }

        }
      }
      catch( ClassNotFoundException e )
      {
        e.printStackTrace();
      }
      catch( SecurityException e )
      {
        e.printStackTrace();
      }
      catch( NoSuchMethodException e )
      {
        e.printStackTrace();
      }
      catch( IllegalArgumentException e )
      {
        e.printStackTrace();
      }
      catch( InstantiationException e )
      {
        e.printStackTrace();
      }
      catch( IllegalAccessException e )
      {

      }
      catch( InvocationTargetException e )
      {
        e.printStackTrace();
      }
    }

  }

  @After
  public void tearDown()
  {
    if( em != null )
    {
      em.getTransaction().rollback();
    }

  }

  public EntityManager getEntityManager()
  {
    return this.em;
  }
}
