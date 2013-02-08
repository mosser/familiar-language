/**
 */
package org.xtext.example.mydsl.fML.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.IdentifierExpr;
import org.xtext.example.mydsl.fML.StringExpr;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Identifier Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.IdentifierExprImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.IdentifierExprImpl#getMetaID <em>Meta ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdentifierExprImpl extends CommandImpl implements IdentifierExpr
{
  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final String VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected String val = VAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getMetaID() <em>Meta ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMetaID()
   * @generated
   * @ordered
   */
  protected StringExpr metaID;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdentifierExprImpl()
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
    return FMLPackage.eINSTANCE.getIdentifierExpr();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(String newVal)
  {
    String oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.IDENTIFIER_EXPR__VAL, oldVal, val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpr getMetaID()
  {
    return metaID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMetaID(StringExpr newMetaID, NotificationChain msgs)
  {
    StringExpr oldMetaID = metaID;
    metaID = newMetaID;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FMLPackage.IDENTIFIER_EXPR__META_ID, oldMetaID, newMetaID);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMetaID(StringExpr newMetaID)
  {
    if (newMetaID != metaID)
    {
      NotificationChain msgs = null;
      if (metaID != null)
        msgs = ((InternalEObject)metaID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FMLPackage.IDENTIFIER_EXPR__META_ID, null, msgs);
      if (newMetaID != null)
        msgs = ((InternalEObject)newMetaID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FMLPackage.IDENTIFIER_EXPR__META_ID, null, msgs);
      msgs = basicSetMetaID(newMetaID, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FMLPackage.IDENTIFIER_EXPR__META_ID, newMetaID, newMetaID));
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
      case FMLPackage.IDENTIFIER_EXPR__META_ID:
        return basicSetMetaID(null, msgs);
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
      case FMLPackage.IDENTIFIER_EXPR__VAL:
        return getVal();
      case FMLPackage.IDENTIFIER_EXPR__META_ID:
        return getMetaID();
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
      case FMLPackage.IDENTIFIER_EXPR__VAL:
        setVal((String)newValue);
        return;
      case FMLPackage.IDENTIFIER_EXPR__META_ID:
        setMetaID((StringExpr)newValue);
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
      case FMLPackage.IDENTIFIER_EXPR__VAL:
        setVal(VAL_EDEFAULT);
        return;
      case FMLPackage.IDENTIFIER_EXPR__META_ID:
        setMetaID((StringExpr)null);
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
      case FMLPackage.IDENTIFIER_EXPR__VAL:
        return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
      case FMLPackage.IDENTIFIER_EXPR__META_ID:
        return metaID != null;
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
    result.append(" (val: ");
    result.append(val);
    result.append(')');
    return result.toString();
  }

} //IdentifierExprImpl