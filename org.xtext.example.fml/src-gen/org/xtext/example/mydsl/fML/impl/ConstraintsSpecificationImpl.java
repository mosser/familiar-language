/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.fML.ConstraintExpr;
import org.xtext.example.mydsl.fML.ConstraintsSpecification;
import org.xtext.example.mydsl.fML.FMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraints Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.ConstraintsSpecificationImpl#getCsts <em>Csts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstraintsSpecificationImpl extends MinimalEObjectImpl.Container implements ConstraintsSpecification
{
  /**
   * The cached value of the '{@link #getCsts() <em>Csts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCsts()
   * @generated
   * @ordered
   */
  protected ConstraintExpr csts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstraintsSpecificationImpl()
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
    return FMLPackage.eINSTANCE.getConstraintsSpecification();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstraintExpr getCsts()
  {
    return csts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCsts(ConstraintExpr newCsts, NotificationChain msgs)
  {
    ConstraintExpr oldCsts = csts;
    csts = newCsts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FMLPackage.CONSTRAINTS_SPECIFICATION__CSTS, oldCsts, newCsts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCsts(ConstraintExpr newCsts)
  {
    if (newCsts != csts)
    {
      NotificationChain msgs = null;
      if (csts != null)
        msgs = ((InternalEObject)csts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FMLPackage.CONSTRAINTS_SPECIFICATION__CSTS, null, msgs);
      if (newCsts != null)
        msgs = ((InternalEObject)newCsts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FMLPackage.CONSTRAINTS_SPECIFICATION__CSTS, null, msgs);
      msgs = basicSetCsts(newCsts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.CONSTRAINTS_SPECIFICATION__CSTS, newCsts, newCsts));
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
      case FMLPackage.CONSTRAINTS_SPECIFICATION__CSTS:
        return basicSetCsts(null, msgs);
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
      case FMLPackage.CONSTRAINTS_SPECIFICATION__CSTS:
        return getCsts();
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
      case FMLPackage.CONSTRAINTS_SPECIFICATION__CSTS:
        setCsts((ConstraintExpr)newValue);
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
      case FMLPackage.CONSTRAINTS_SPECIFICATION__CSTS:
        setCsts((ConstraintExpr)null);
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
      case FMLPackage.CONSTRAINTS_SPECIFICATION__CSTS:
        return csts != null;
    }
    return super.eIsSet(featureID);
  }

} //ConstraintsSpecificationImpl
