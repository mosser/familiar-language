/**
 */
package org.xtext.example.mydsl.fML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.LoadGeneric;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Generic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.LoadGenericImpl#getStream <em>Stream</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.LoadGenericImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.LoadGenericImpl#getNs <em>Ns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadGenericImpl extends CommandImpl implements LoadGeneric
{
  /**
   * The default value of the '{@link #getStream() <em>Stream</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStream()
   * @generated
   * @ordered
   */
  protected static final String STREAM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStream() <em>Stream</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStream()
   * @generated
   * @ordered
   */
  protected String stream = STREAM_EDEFAULT;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<String> params;

  /**
   * The default value of the '{@link #getNs() <em>Ns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNs()
   * @generated
   * @ordered
   */
  protected static final String NS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNs() <em>Ns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNs()
   * @generated
   * @ordered
   */
  protected String ns = NS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LoadGenericImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FMLPackage.eINSTANCE.getLoadGeneric();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStream()
  {
    return stream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStream(String newStream)
  {
    String oldStream = stream;
    stream = newStream;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.LOAD_GENERIC__STREAM, oldStream, stream));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getParams()
  {
    if (params == null)
    {
      params = new EDataTypeEList<String>(String.class, this, FMLPackage.LOAD_GENERIC__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNs()
  {
    return ns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNs(String newNs)
  {
    String oldNs = ns;
    ns = newNs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.LOAD_GENERIC__NS, oldNs, ns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FMLPackage.LOAD_GENERIC__STREAM:
        return getStream();
      case FMLPackage.LOAD_GENERIC__PARAMS:
        return getParams();
      case FMLPackage.LOAD_GENERIC__NS:
        return getNs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FMLPackage.LOAD_GENERIC__STREAM:
        setStream((String)newValue);
        return;
      case FMLPackage.LOAD_GENERIC__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends String>)newValue);
        return;
      case FMLPackage.LOAD_GENERIC__NS:
        setNs((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FMLPackage.LOAD_GENERIC__STREAM:
        setStream(STREAM_EDEFAULT);
        return;
      case FMLPackage.LOAD_GENERIC__PARAMS:
        getParams().clear();
        return;
      case FMLPackage.LOAD_GENERIC__NS:
        setNs(NS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FMLPackage.LOAD_GENERIC__STREAM:
        return STREAM_EDEFAULT == null ? stream != null : !STREAM_EDEFAULT.equals(stream);
      case FMLPackage.LOAD_GENERIC__PARAMS:
        return params != null && !params.isEmpty();
      case FMLPackage.LOAD_GENERIC__NS:
        return NS_EDEFAULT == null ? ns != null : !NS_EDEFAULT.equals(ns);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (stream: ");
    result.append(stream);
    result.append(", params: ");
    result.append(params);
    result.append(", ns: ");
    result.append(ns);
    result.append(')');
    return result.toString();
  }

} //LoadGenericImpl
