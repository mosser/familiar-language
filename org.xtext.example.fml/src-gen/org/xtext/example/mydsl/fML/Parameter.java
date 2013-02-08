/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.Parameter#getParam <em>Param</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.Parameter#getTyped <em>Typed</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.Parameter#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' attribute.
   * @see #setParam(String)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getParameter_Param()
   * @model
   * @generated
   */
  String getParam();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.Parameter#getParam <em>Param</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' attribute.
   * @see #getParam()
   * @generated
   */
  void setParam(String value);

  /**
   * Returns the value of the '<em><b>Typed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Typed</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Typed</em>' attribute.
   * @see #setTyped(String)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getParameter_Typed()
   * @model
   * @generated
   */
  String getTyped();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.Parameter#getTyped <em>Typed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Typed</em>' attribute.
   * @see #getTyped()
   * @generated
   */
  void setTyped(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(lType)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getParameter_Type()
   * @model containment="true"
   * @generated
   */
  lType getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.Parameter#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(lType value);

} // Parameter
