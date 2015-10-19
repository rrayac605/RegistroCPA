package mx.gob.imss.cit.dictamen.contador.services.base;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import javax.ejb.EJB;
import javax.persistence.PersistenceContext;

import mx.gob.imss.cit.dictamen.contador.commons.util.ReflectionHelper;
import mx.gob.imss.cit.dictamen.registro.persistence.dao.base.AbstractDBTestUnit;

import org.junit.After;
import org.junit.Before;

/**
 * Clase de prueba unitaria de la que deben extender los
 * 
 * @author ajfuentes
 */
public abstract class AbstractServiceTestUnit
{


	private AbstractDBTestUnit dao= new AbstractDBTestUnit(){};	
	
	
	
  @Before
  public void setUp()
  {
	  dao.setUp();
  }



  protected void connect( Object o )
  {
    this.connect( o, 3 );
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
            ReflectionHelper.set( this.dao.getEntityManager(), field.getName(), o );
          }

          EJB ejb = field.getAnnotation( javax.ejb.EJB.class );
          if( ejb != null )
          {
            String className = field.getType().getCanonicalName();

            Class<?> clazz = Class.forName( className );

            if( this.dao.getMapDAO().containsKey( clazz ) )
            {
              Constructor<?> ctor = this.dao.getMapDAO().get( clazz ).getConstructor();
              Object dao = ctor.newInstance();

              Field[] fieldDAOs = dao.getClass().getDeclaredFields();
              for( Field fieldDAO : fieldDAOs )
              {
                persistenceContext = fieldDAO.getAnnotation( PersistenceContext.class );
                if( persistenceContext != null )
                {
                  ReflectionHelper.set( this.dao.getEntityManager(), fieldDAO.getName(), dao );
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
  public void tearDown(){
	  dao.tearDown();

  }


}
