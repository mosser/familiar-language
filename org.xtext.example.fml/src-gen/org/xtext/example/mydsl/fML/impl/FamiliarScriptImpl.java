/**
 */
package org.xtext.example.mydsl.fML.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.fML.FMLPackage;
import org.xtext.example.mydsl.fML.FamiliarScript;
import org.xtext.example.mydsl.fML.Parameter;
import org.xtext.example.mydsl.fML.ScriptCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Familiar Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.FamiliarScriptImpl#getParams <em>Params</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.FamiliarScriptImpl#getCmds <em>Cmds</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.impl.FamiliarScriptImpl#getExports <em>Exports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamiliarScriptImpl extends MinimalEObjectImpl.Container implements FamiliarScript
{
  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Parameter> params;

  /**
   * The cached value of the '{@link #getCmds() <em>Cmds</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmds()
   * @generated
   * @ordered
   */
  protected EList<ScriptCommand> cmds;

  /**
   * The cached value of the '{@link #getExports() <em>Exports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExports()
   * @generated
   * @ordered
   */
  protected EList<EObject> exports;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FamiliarScriptImpl()
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
    return FMLPackage.eINSTANCE.getFamiliarScript();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Parameter>(Parameter.class, this, FMLPackage.FAMILIAR_SCRIPT__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScriptCommand> getCmds()
  {
    if (cmds == null)
    {
      cmds = new EObjectContainmentEList<ScriptCommand>(ScriptCommand.class, this, FMLPackage.FAMILIAR_SCRIPT__CMDS);
    }
    return cmds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getExports()
  {
    if (exports == null)
    {
      exports = new EObjectContainmentEList<EObject>(EObject.class, this, FMLPackage.FAMILIAR_SCRIPT__EXPORTS);
    }
    return exports;
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
      case FMLPackage.FAMILIAR_SCRIPT__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case FMLPackage.FAMILIAR_SCRIPT__CMDS:
        return ((InternalEList<?>)getCmds()).basicRemove(otherEnd, msgs);
      case FMLPackage.FAMILIAR_SCRIPT__EXPORTS:
        return ((InternalEList<?>)getExports()).basicRemove(otherEnd, msgs);
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
      case FMLPackage.FAMILIAR_SCRIPT__PARAMS:
        return getParams();
      case FMLPackage.FAMILIAR_SCRIPT__CMDS:
        return getCmds();
      case FMLPackage.FAMILIAR_SCRIPT__EXPORTS:
        return getExports();
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
      case FMLPackage.FAMILIAR_SCRIPT__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Parameter>)newValue);
        return;
      case FMLPackage.FAMILIAR_SCRIPT__CMDS:
        getCmds().clear();
        getCmds().addAll((Collection<? extends ScriptCommand>)newValue);
        return;
      case FMLPackage.FAMILIAR_SCRIPT__EXPORTS:
        getExports().clear();
        getExports().addAll((Collection<? extends EObject>)newValue);
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
      case FMLPackage.FAMILIAR_SCRIPT__PARAMS:
        getParams().clear();
        return;
      case FMLPackage.FAMILIAR_SCRIPT__CMDS:
        getCmds().clear();
        return;
      case FMLPackage.FAMILIAR_SCRIPT__EXPORTS:
        getExports().clear();
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
      case FMLPackage.FAMILIAR_SCRIPT__PARAMS:
        return params != null && !params.isEmpty();
      case FMLPackage.FAMILIAR_SCRIPT__CMDS:
        return cmds != null && !cmds.isEmpty();
      case FMLPackage.FAMILIAR_SCRIPT__EXPORTS:
        return exports != null && !exports.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FamiliarScriptImpl