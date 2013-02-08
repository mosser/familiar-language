/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orgroup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.Orgroup#getFeatures <em>Features</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getOrgroup()
 * @model
 * @generated
 */
public interface Orgroup extends Child
{
  /**
   * Returns the value of the '<em><b>Features</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Features</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Features</em>' attribute list.
   * @see org.xtext.example.mydsl.fML.FMLPackage#getOrgroup_Features()
   * @model unique="false"
   * @generated
   */
  EList<String> getFeatures();

} // Orgroup