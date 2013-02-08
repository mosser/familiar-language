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
import org.xtext.example.mydsl.fML.IntegerCommand;
import org.xtext.example.mydsl.fML.PairwiseCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pairwise Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.PairwiseCommandImpl#getFm <em>Fm</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.PairwiseCommandImpl#getMinimization <em>Minimization</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.PairwiseCommandImpl#getPartial <em>Partial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PairwiseCommandImpl extends CommandImpl implements PairwiseCommand
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
   * The cached value of the '{@link #getMinimization() <em>Minimization</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinimization()
   * @generated
   * @ordered
   */
  protected IntegerCommand minimization;

  /**
   * The cached value of the '{@link #getPartial() <em>Partial</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartial()
   * @generated
   * @ordered
   */
  protected IntegerCommand partial;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PairwiseCommandImpl()
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
    return FMLPackage.eINSTANCE.getPairwiseCommand();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FMLPackage.PAIRWISE_COMMAND__FM, oldFm, newFm);
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
        msgs = ((InternalEObject)fm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FMLPackage.PAIRWISE_COMMAND__FM, null, msgs);
      if (newFm != null)
        msgs = ((InternalEObject)newFm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FMLPackage.PAIRWISE_COMMAND__FM, null, msgs);
      msgs = basicSetFm(newFm, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.PAIRWISE_COMMAND__FM, newFm, newFm));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerCommand getMinimization()
  {
    return minimization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinimization(IntegerCommand newMinimization, NotificationChain msgs)
  {
    IntegerCommand oldMinimization = minimization;
    minimization = newMinimization;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FMLPackage.PAIRWISE_COMMAND__MINIMIZATION, oldMinimization, newMinimization);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinimization(IntegerCommand newMinimization)
  {
    if (newMinimization != minimization)
    {
      NotificationChain msgs = null;
      if (minimization != null)
        msgs = ((InternalEObject)minimization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FMLPackage.PAIRWISE_COMMAND__MINIMIZATION, null, msgs);
      if (newMinimization != null)
        msgs = ((InternalEObject)newMinimization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FMLPackage.PAIRWISE_COMMAND__MINIMIZATION, null, msgs);
      msgs = basicSetMinimization(newMinimization, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.PAIRWISE_COMMAND__MINIMIZATION, newMinimization, newMinimization));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerCommand getPartial()
  {
    return partial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPartial(IntegerCommand newPartial, NotificationChain msgs)
  {
    IntegerCommand oldPartial = partial;
    partial = newPartial;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FMLPackage.PAIRWISE_COMMAND__PARTIAL, oldPartial, newPartial);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartial(IntegerCommand newPartial)
  {
    if (newPartial != partial)
    {
      NotificationChain msgs = null;
      if (partial != null)
        msgs = ((InternalEObject)partial).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FMLPackage.PAIRWISE_COMMAND__PARTIAL, null, msgs);
      if (newPartial != null)
        msgs = ((InternalEObject)newPartial).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FMLPackage.PAIRWISE_COMMAND__PARTIAL, null, msgs);
      msgs = basicSetPartial(newPartial, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.PAIRWISE_COMMAND__PARTIAL, newPartial, newPartial));
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
      case FMLPackage.PAIRWISE_COMMAND__FM:
        return basicSetFm(null, msgs);
      case FMLPackage.PAIRWISE_COMMAND__MINIMIZATION:
        return basicSetMinimization(null, msgs);
      case FMLPackage.PAIRWISE_COMMAND__PARTIAL:
        return basicSetPartial(null, msgs);
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
      case FMLPackage.PAIRWISE_COMMAND__FM:
        return getFm();
      case FMLPackage.PAIRWISE_COMMAND__MINIMIZATION:
        return getMinimization();
      case FMLPackage.PAIRWISE_COMMAND__PARTIAL:
        return getPartial();
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
      case FMLPackage.PAIRWISE_COMMAND__FM:
        setFm((FMCommand)newValue);
        return;
      case FMLPackage.PAIRWISE_COMMAND__MINIMIZATION:
        setMinimization((IntegerCommand)newValue);
        return;
      case FMLPackage.PAIRWISE_COMMAND__PARTIAL:
        setPartial((IntegerCommand)newValue);
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
      case FMLPackage.PAIRWISE_COMMAND__FM:
        setFm((FMCommand)null);
        return;
      case FMLPackage.PAIRWISE_COMMAND__MINIMIZATION:
        setMinimization((IntegerCommand)null);
        return;
      case FMLPackage.PAIRWISE_COMMAND__PARTIAL:
        setPartial((IntegerCommand)null);
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
      case FMLPackage.PAIRWISE_COMMAND__FM:
        return fm != null;
      case FMLPackage.PAIRWISE_COMMAND__MINIMIZATION:
        return minimization != null;
      case FMLPackage.PAIRWISE_COMMAND__PARTIAL:
        return partial != null;
    }
    return super.eIsSet(featureID);
  }

} //PairwiseCommandImpl
