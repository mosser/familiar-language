/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.fML.FMCommand;
import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.SetCommand;
import org.xtext.example.mydsl.fML.Slice;
import org.xtext.example.mydsl.fML.SliceMode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.SliceImpl#getFm <em>Fm</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.SliceImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.SliceImpl#getFts <em>Fts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SliceImpl extends CommandImpl implements Slice
{
  /**
   * The cached value of the '{@link #getFm() <em>Fm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFm()
   * @generated
   * @ordered
   */
  protected FMCommand fm;

  /**
   * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected static final SliceMode MODE_EDEFAULT = SliceMode.INCLUDING;

  /**
   * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMode()
   * @generated
   * @ordered
   */
  protected SliceMode mode = MODE_EDEFAULT;

  /**
   * The cached value of the '{@link #getFts() <em>Fts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFts()
   * @generated
   * @ordered
   */
  protected SetCommand fts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SliceImpl()
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
    return FMLPackage.eINSTANCE.getSlice();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FMCommand getFm()
  {
    return fm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFm(FMCommand newFm, NotificationChain msgs)
  {
    FMCommand oldFm = fm;
    fm = newFm;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FMLPackage.SLICE__FM, oldFm, newFm);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFm(FMCommand newFm)
  {
    if (newFm != fm)
    {
      NotificationChain msgs = null;
      if (fm != null)
        msgs = ((InternalEObject)fm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FMLPackage.SLICE__FM, null, msgs);
      if (newFm != null)
        msgs = ((InternalEObject)newFm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FMLPackage.SLICE__FM, null, msgs);
      msgs = basicSetFm(newFm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.SLICE__FM, newFm, newFm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SliceMode getMode()
  {
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMode(SliceMode newMode)
  {
    SliceMode oldMode = mode;
    mode = newMode == null ? MODE_EDEFAULT : newMode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.SLICE__MODE, oldMode, mode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetCommand getFts()
  {
    return fts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFts(SetCommand newFts, NotificationChain msgs)
  {
    SetCommand oldFts = fts;
    fts = newFts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FMLPackage.SLICE__FTS, oldFts, newFts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFts(SetCommand newFts)
  {
    if (newFts != fts)
    {
      NotificationChain msgs = null;
      if (fts != null)
        msgs = ((InternalEObject)fts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FMLPackage.SLICE__FTS, null, msgs);
      if (newFts != null)
        msgs = ((InternalEObject)newFts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FMLPackage.SLICE__FTS, null, msgs);
      msgs = basicSetFts(newFts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.SLICE__FTS, newFts, newFts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FMLPackage.SLICE__FM:
        return basicSetFm(null, msgs);
      case FMLPackage.SLICE__FTS:
        return basicSetFts(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FMLPackage.SLICE__FM:
        return getFm();
      case FMLPackage.SLICE__MODE:
        return getMode();
      case FMLPackage.SLICE__FTS:
        return getFts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FMLPackage.SLICE__FM:
        setFm((FMCommand)newValue);
        return;
      case FMLPackage.SLICE__MODE:
        setMode((SliceMode)newValue);
        return;
      case FMLPackage.SLICE__FTS:
        setFts((SetCommand)newValue);
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
      case FMLPackage.SLICE__FM:
        setFm((FMCommand)null);
        return;
      case FMLPackage.SLICE__MODE:
        setMode(MODE_EDEFAULT);
        return;
      case FMLPackage.SLICE__FTS:
        setFts((SetCommand)null);
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
      case FMLPackage.SLICE__FM:
        return fm != null;
      case FMLPackage.SLICE__MODE:
        return mode != MODE_EDEFAULT;
      case FMLPackage.SLICE__FTS:
        return fts != null;
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
    result.append(" (mode: ");
    result.append(mode);
    result.append(')');
    return result.toString();
  }

} //SliceImpl
