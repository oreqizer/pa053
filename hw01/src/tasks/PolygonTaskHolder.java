package tasks;

/**
* tasks/PolygonTaskHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hw01.idl
* Friday, April 2, 2021 8:43:54 PM CEST
*/

public final class PolygonTaskHolder implements org.omg.CORBA.portable.Streamable
{
  public tasks.PolygonTask value = null;

  public PolygonTaskHolder ()
  {
  }

  public PolygonTaskHolder (tasks.PolygonTask initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = tasks.PolygonTaskHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    tasks.PolygonTaskHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return tasks.PolygonTaskHelper.type ();
  }

}
