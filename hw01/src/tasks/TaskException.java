package tasks;


/**
* tasks/TaskException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hw01.idl
* Friday, April 2, 2021 8:43:54 PM CEST
*/

public final class TaskException extends org.omg.CORBA.UserException
{
  public String message = null;

  public TaskException ()
  {
    super(TaskExceptionHelper.id());
  } // ctor

  public TaskException (String _message)
  {
    super(TaskExceptionHelper.id());
    message = _message;
  } // ctor


  public TaskException (String $reason, String _message)
  {
    super(TaskExceptionHelper.id() + "  " + $reason);
    message = _message;
  } // ctor

} // class TaskException
