/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Listing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.Listing#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.Listing#getOpt <em>Opt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getListing()
 * @model
 * @generated
 */
public interface Listing extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(String)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getListing_Val()
   * @model
   * @generated
   */
  String getVal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.Listing#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(String value);

  /**
   * Returns the value of the '<em><b>Opt</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.fML.OPT_LISTING}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt</em>' attribute.
   * @see org.xtext.example.mydsl.fML.OPT_LISTING
   * @see #setOpt(OPT_LISTING)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getListing_Opt()
   * @model
   * @generated
   */
  OPT_LISTING getOpt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.Listing#getOpt <em>Opt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt</em>' attribute.
   * @see org.xtext.example.mydsl.fML.OPT_LISTING
   * @see #getOpt()
   * @generated
   */
  void setOpt(OPT_LISTING value);

} // Listing
