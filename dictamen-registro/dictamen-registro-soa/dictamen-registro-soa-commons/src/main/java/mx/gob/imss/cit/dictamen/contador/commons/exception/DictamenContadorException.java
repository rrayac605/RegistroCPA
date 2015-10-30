package mx.gob.imss.cit.dictamen.contador.commons.exception;

import java.util.Date;

public class DictamenContadorException extends Exception
{
	  /**
	   * 
	   */
	  private static final long serialVersionUID = -6072543602508126247L;

	  /** ID de error */
	  private long id;

	  /** Código de error */
	  private int code;

	  /** Descripción de error */
	  private String description;

	  /** Fecha de error */
	  private Date date;
	  
	  /** Argumentos */
	  private Object[] args;

	  /**
	   * Constructor base
	   */
	  public DictamenContadorException()
	  {
	    super();
	  }

	  /**
	   * Constructor con mensaje
	   * 
	   * @param message Mensaje de error
	   */
	  public DictamenContadorException( String message )
	  {
	    super( message );
	  }

	  /**
	   * Constructor con mensaje y causa de error
	   * 
	   * @param message Mensaje de error
	   * @param cause Causa de error
	   */
	  public DictamenContadorException( String message, Throwable cause )
	  {
	    super( message, cause );
	  }

	  /**
	   * Constructor con causa de error
	   * 
	   * @param cause Causa de error
	   */
	  public DictamenContadorException( Throwable cause )
	  {
	    super( cause );
	  }

	  /**
	   * @return the code
	   */
	  public int getCode()
	  {
	    return code;
	  }

	  /**
	   * @param code the code to set
	   */
	  public void setCode( int code )
	  {
	    this.code = code;
	  }

	  /**
	   * @return the date
	   */
	  public Date getDate()
	  {
	    return date != null ? (Date) date.clone() : null;
	  }

	  /**
	   * @param date the date to set
	   */
	  public void setDate( Date date )
	  {
	    this.date = date != null ? (Date) date.clone() : null;
	  }

	  /**
	   * @return the description
	   */
	  public String getDescription()
	  {
	    return description;
	  }

	  /**
	   * @param description the description to set
	   */
	  public void setDescription( String description )
	  {
	    this.description = description;
	  }

	  /**
	   * @return the id
	   */
	  public long getId()
	  {
	    return id;
	  }

	  /**
	   * @param id the id to set
	   */
	  public void setId( long id )
	  {
	    this.id = id;
	  }

	  /**
	   * @return the args
	   */
	  public Object[] getArgs()
	  {
	    return args != null ? args.clone(): new Object[0];
	  }

	  /**
	   * @param args the args to set
	   */
	  public void setArgs( Object[] args )
	  {
	    this.args = args != null ? args.clone() : null;
	  }

	 
	}
