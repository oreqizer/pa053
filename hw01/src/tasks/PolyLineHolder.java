package tasks;


/**
* tasks/PolyLineHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hw01.idl
* Friday, April 2, 2021 8:43:54 PM CEST
*/

public final class PolyLineHolder implements org.omg.CORBA.portable.Streamable
{
  public tasks.Point value[] = null;

  public PolyLineHolder ()
  {
  }

  public PolyLineHolder (tasks.Point[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = tasks.PolyLineHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    tasks.PolyLineHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return tasks.PolyLineHelper.type ();
  }

}