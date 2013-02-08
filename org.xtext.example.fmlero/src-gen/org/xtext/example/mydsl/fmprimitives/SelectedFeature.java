/**
 */
package org.xtext.example.mydsl.fmprimitives;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selected Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fmprimitives.SelectedFeature#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fmprimitives.FmprimitivesPackage#getSelectedFeature()
 * @model
 * @generated
 */
public interface SelectedFeature extends FeatureModelPrimitive
{
  /**
   * Returns the value of the '<em><b>Feature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Feature</em>' reference.
   * @see #setFeature(Feature)
   * @see org.xtext.example.mydsl.fmprimitives.FmprimitivesPackage#getSelectedFeature_Feature()
   * @model
   * @generated
   */
  Feature getFeature();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fmprimitives.SelectedFeature#getFeature <em>Feature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Feature</em>' reference.
   * @see #getFeature()
   * @generated
   */
  void setFeature(Feature value);

} // SelectedFeature
