package tasks;

/**
* tasks/SimpleTaskHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hw01.idl
* Friday, April 2, 2021 9:02:28 PM CEST
*/

public final class SimpleTaskHolder implements org.omg.CORBA.portable.Streamable
{
  public tasks.SimpleTask value = null;

  public SimpleTaskHolder ()
  {
  }

  public SimpleTaskHolder (tasks.SimpleTask initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = tasks.SimpleTaskHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    tasks.SimpleTaskHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return tasks.SimpleTaskHelper.type ();
  }

}
