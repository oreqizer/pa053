package tasks;


/**
* tasks/PolygonTaskOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hw01.idl
* Friday, April 2, 2021 8:43:54 PM CEST
*/

public interface PolygonTaskOperations  extends tasks.AbstractTask
{
  tasks.Point[] getPolyLine ();
  void sendResult (float polyLineLength);
} // interface PolygonTaskOperations