/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.fML.Assertion;
import org.xtext.example.mydsl.fML.ComplexCommand;
import org.xtext.example.mydsl.fML.FMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.AssertionImpl#getAssertion <em>Assertion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssertionImpl extends CommandImpl implements Assertion
{
  /**
   * The cached value of the '{@link #getAssertion() <em>Assertion</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssertion()
   * @generated
   * @ordered
   */
  protected ComplexCommand assertion;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssertionImpl()
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
    return FMLPackage.eINSTANCE.getAssertion();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexCommand getAssertion()
  {
    return assertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssertion(ComplexCommand newAssertion, NotificationChain msgs)
  {
    ComplexCommand oldAssertion = assertion;
    assertion = newAssertion;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FMLPackage.ASSERTION__ASSERTION, oldAssertion, newAssertion);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssertion(ComplexCommand newAssertion)
  {
    if (newAssertion != assertion)
    {
      NotificationChain msgs = null;
      if (assertion != null)
        msgs = ((InternalEObject)assertion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FMLPackage.ASSERTION__ASSERTION, null, msgs);
      if (newAssertion != null)
        msgs = ((InternalEObject)newAssertion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FMLPackage.ASSERTION__ASSERTION, null, msgs);
      msgs = basicSetAssertion(newAssertion, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.ASSERTION__ASSERTION, newAssertion, newAssertion));
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
      case FMLPackage.ASSERTION__ASSERTION:
        return basicSetAssertion(null, msgs);
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
      case FMLPackage.ASSERTION__ASSERTION:
        return getAssertion();
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
      case FMLPackage.ASSERTION__ASSERTION:
        setAssertion((ComplexCommand)newValue);
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
      case FMLPackage.ASSERTION__ASSERTION:
        setAssertion((ComplexCommand)null);
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
      case FMLPackage.ASSERTION__ASSERTION:
        return assertion != null;
    }
    return super.eIsSet(featureID);
  }

} //AssertionImpl