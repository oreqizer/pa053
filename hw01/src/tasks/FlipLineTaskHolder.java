package tasks;

/**
* tasks/FlipLineTaskHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hw01.idl
* Friday, April 2, 2021 9:02:28 PM CEST
*/

public final class FlipLineTaskHolder implements org.omg.CORBA.portable.Streamable
{
  public tasks.FlipLineTask value = null;

  public FlipLineTaskHolder ()
  {
  }

  public FlipLineTaskHolder (tasks.FlipLineTask initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = tasks.FlipLineTaskHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    tasks.FlipLineTaskHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return tasks.FlipLineTaskHelper.type ();
  }

}
