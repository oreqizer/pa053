package tasks;

/**
* tasks/MatrixTaskHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hw01.idl
* Friday, April 2, 2021 9:02:28 PM CEST
*/

public final class MatrixTaskHolder implements org.omg.CORBA.portable.Streamable
{
  public tasks.MatrixTask value = null;

  public MatrixTaskHolder ()
  {
  }

  public MatrixTaskHolder (tasks.MatrixTask initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = tasks.MatrixTaskHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    tasks.MatrixTaskHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return tasks.MatrixTaskHelper.type ();
  }

}
