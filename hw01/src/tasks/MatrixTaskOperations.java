package tasks;


/**
* tasks/MatrixTaskOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hw01.idl
* Friday, April 2, 2021 9:02:28 PM CEST
*/

public interface MatrixTaskOperations  extends tasks.AbstractTask
{
  int getMatrixItem (int row, int col) throws tasks.TaskException;
  void sendResult (int matrixDeterminant);
} // interface MatrixTaskOperations
