package tasks;

/**
* tasks/PointHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hw01.idl
* Friday, April 2, 2021 9:02:28 PM CEST
*/

public final class PointHolder implements org.omg.CORBA.portable.Streamable
{
  public tasks.Point value = null;

  public PointHolder ()
  {
  }

  public PointHolder (tasks.Point initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = tasks.PointHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    tasks.PointHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return tasks.PointHelper.type ();
  }

}
