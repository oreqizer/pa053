package tasks;


/**
* tasks/_MatrixTaskStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from hw01.idl
* Friday, April 2, 2021 9:02:28 PM CEST
*/

public class _MatrixTaskStub extends org.omg.CORBA.portable.ObjectImpl implements tasks.MatrixTask
{

  public int getMatrixItem (int row, int col) throws tasks.TaskException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getMatrixItem", true);
                $out.write_ulong (row);
                $out.write_ulong (col);
                $in = _invoke ($out);
                int $result = $in.read_ulong ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:tasks/TaskException:1.0"))
                    throw tasks.TaskExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getMatrixItem (row, col        );
            } finally {
                _releaseReply ($in);
            }
  } // getMatrixItem

  public void sendResult (int matrixDeterminant)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("sendResult", true);
                $out.write_long (matrixDeterminant);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                sendResult (matrixDeterminant        );
            } finally {
                _releaseReply ($in);
            }
  } // sendResult

  public String info ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("info", true);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return info (        );
            } finally {
                _releaseReply ($in);
            }
  } // info

  public tasks.AbstractTask next () throws tasks.TaskException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("next", true);
                $in = _invoke ($out);
                tasks.AbstractTask $result = tasks.AbstractTaskHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:tasks/TaskException:1.0"))
                    throw tasks.TaskExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return next (        );
            } finally {
                _releaseReply ($in);
            }
  } // next

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:tasks/MatrixTask:1.0", 
    "IDL:tasks/AbstractTask:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _MatrixTaskStub
