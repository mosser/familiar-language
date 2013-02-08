/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.fML.AddConstraint;
import org.xtext.example.mydsl.fML.ConstraintCommand;
import org.xtext.example.mydsl.fML.FMCommand;
import org.xtext.example.mydsl.fML.FMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.AddConstraintImpl#getCst <em>Cst</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.AddConstraintImpl#getFm <em>Fm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddConstraintImpl extends CommandImpl implements AddConstraint
{
  /**
   * The cached value of the '{@link #getCst() <em>Cst</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCst()
   * @generated
   * @ordered
   */
  protected ConstraintCommand cst;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddConstraintImpl()
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
    return FMLPackage.eINSTANCE.getAddConstraint();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintCommand getCst()
  {
    return cst;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCst(ConstraintCommand newCst, NotificationChain msgs)
  {
    ConstraintCommand oldCst = cst;
    cst = newCst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FMLPackage.ADD_CONSTRAINT__CST, oldCst, newCst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCst(ConstraintCommand newCst)
  {
    if (newCst != cst)
    {
      NotificationChain msgs = null;
      if (cst != null)
        msgs = ((InternalEObject)cst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FMLPackage.ADD_CONSTRAINT__CST, null, msgs);
      if (newCst != null)
        msgs = ((InternalEObject)newCst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FMLPackage.ADD_CONSTRAINT__CST, null, msgs);
      msgs = basicSetCst(newCst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.ADD_CONSTRAINT__CST, newCst, newCst));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FMLPackage.ADD_CONSTRAINT__FM, oldFm, newFm);
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
        msgs = ((InternalEObject)fm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FMLPackage.ADD_CONSTRAINT__FM, null, msgs);
      if (newFm != null)
        msgs = ((InternalEObject)newFm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FMLPackage.ADD_CONSTRAINT__FM, null, msgs);
      msgs = basicSetFm(newFm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.ADD_CONSTRAINT__FM, newFm, newFm));
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
      case FMLPackage.ADD_CONSTRAINT__CST:
        return basicSetCst(null, msgs);
      case FMLPackage.ADD_CONSTRAINT__FM:
        return basicSetFm(null, msgs);
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
      case FMLPackage.ADD_CONSTRAINT__CST:
        return getCst();
      case FMLPackage.ADD_CONSTRAINT__FM:
        return getFm();
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
      case FMLPackage.ADD_CONSTRAINT__CST:
        setCst((ConstraintCommand)newValue);
        return;
      case FMLPackage.ADD_CONSTRAINT__FM:
        setFm((FMCommand)newValue);
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
      case FMLPackage.ADD_CONSTRAINT__CST:
        setCst((ConstraintCommand)null);
        return;
      case FMLPackage.ADD_CONSTRAINT__FM:
        setFm((FMCommand)null);
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
      case FMLPackage.ADD_CONSTRAINT__CST:
        return cst != null;
      case FMLPackage.ADD_CONSTRAINT__FM:
        return fm != null;
    }
    return super.eIsSet(featureID);
  }

} //AddConstraintImpl
