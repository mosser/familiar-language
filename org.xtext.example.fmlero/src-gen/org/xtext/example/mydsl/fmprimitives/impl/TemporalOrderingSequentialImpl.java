/**
 */
package org.xtext.example.mydsl.fmprimitives.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.example.mydsl.fmprimitives.Feature;
import org.xtext.example.mydsl.fmprimitives.FmprimitivesPackage;
import org.xtext.example.mydsl.fmprimitives.TemporalOrderingSequential;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Temporal Ordering Sequential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fmprimitives.impl.TemporalOrderingSequentialImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fmprimitives.impl.TemporalOrderingSequentialImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemporalOrderingSequentialImpl extends FeatureModelPrimitiveImpl implements TemporalOrderingSequential
{
  /**
   * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSources()
   * @generated
   * @ordered
   */
  protected EList<Feature> sources;

  /**
   * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargets()
   * @generated
   * @ordered
   */
  protected EList<Feature> targets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemporalOrderingSequentialImpl()
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
    return FmprimitivesPackage.Literals.TEMPORAL_ORDERING_SEQUENTIAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getSources()
  {
    if (sources == null)
    {
      sources = new EObjectResolvingEList<Feature>(Feature.class, this, FmprimitivesPackage.TEMPORAL_ORDERING_SEQUENTIAL__SOURCES);
    }
    return sources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Feature> getTargets()
  {
    if (targets == null)
    {
      targets = new EObjectResolvingEList<Feature>(Feature.class, this, FmprimitivesPackage.TEMPORAL_ORDERING_SEQUENTIAL__TARGETS);
    }
    return targets;
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
      case FmprimitivesPackage.TEMPORAL_ORDERING_SEQUENTIAL__SOURCES:
        return getSources();
      case FmprimitivesPackage.TEMPORAL_ORDERING_SEQUENTIAL__TARGETS:
        return getTargets();
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
      case FmprimitivesPackage.TEMPORAL_ORDERING_SEQUENTIAL__SOURCES:
        getSources().clear();
        getSources().addAll((Collection<? extends Feature>)newValue);
        return;
      case FmprimitivesPackage.TEMPORAL_ORDERING_SEQUENTIAL__TARGETS:
        getTargets().clear();
        getTargets().addAll((Collection<? extends Feature>)newValue);
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
      case FmprimitivesPackage.TEMPORAL_ORDERING_SEQUENTIAL__SOURCES:
        getSources().clear();
        return;
      case FmprimitivesPackage.TEMPORAL_ORDERING_SEQUENTIAL__TARGETS:
        getTargets().clear();
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
      case FmprimitivesPackage.TEMPORAL_ORDERING_SEQUENTIAL__SOURCES:
        return sources != null && !sources.isEmpty();
      case FmprimitivesPackage.TEMPORAL_ORDERING_SEQUENTIAL__TARGETS:
        return targets != null && !targets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TemporalOrderingSequentialImpl
