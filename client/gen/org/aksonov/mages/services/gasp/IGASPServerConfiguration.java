/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /Users/aksonov/Documents/Mages2/client/src/org/aksonov/mages/services/gasp/IGASPServerConfiguration.aidl
 */
package org.aksonov.mages.services.gasp;
public interface IGASPServerConfiguration extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements org.aksonov.mages.services.gasp.IGASPServerConfiguration
{
private static final java.lang.String DESCRIPTOR = "org.aksonov.mages.services.gasp.IGASPServerConfiguration";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an org.aksonov.mages.services.gasp.IGASPServerConfiguration interface,
 * generating a proxy if needed.
 */
public static org.aksonov.mages.services.gasp.IGASPServerConfiguration asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof org.aksonov.mages.services.gasp.IGASPServerConfiguration))) {
return ((org.aksonov.mages.services.gasp.IGASPServerConfiguration)iin);
}
return new org.aksonov.mages.services.gasp.IGASPServerConfiguration.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_createSession:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.createSession();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setConnectInfo:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
int _arg2;
_arg2 = data.readInt();
java.lang.String _arg3;
_arg3 = data.readString();
java.lang.String _arg4;
_arg4 = data.readString();
boolean _arg5;
_arg5 = (0!=data.readInt());
this.setConnectInfo(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements org.aksonov.mages.services.gasp.IGASPServerConfiguration
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
public int createSession() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_createSession, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void setConnectInfo(int session, java.lang.String host, int appId, java.lang.String username, java.lang.String password, boolean isComet) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(session);
_data.writeString(host);
_data.writeInt(appId);
_data.writeString(username);
_data.writeString(password);
_data.writeInt(((isComet)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setConnectInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_createSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setConnectInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public int createSession() throws android.os.RemoteException;
public void setConnectInfo(int session, java.lang.String host, int appId, java.lang.String username, java.lang.String password, boolean isComet) throws android.os.RemoteException;
}