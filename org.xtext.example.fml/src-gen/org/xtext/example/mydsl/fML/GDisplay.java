/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GDisplay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.GDisplay#getCmdDisplay <em>Cmd Display</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.GDisplay#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getGDisplay()
 * @model
 * @generated
 */
public interface GDisplay extends Command
{
  /**
   * Returns the value of the '<em><b>Cmd Display</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmd Display</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd Display</em>' attribute.
   * @see #setCmdDisplay(String)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getGDisplay_CmdDisplay()
   * @model
   * @generated
   */
  String getCmdDisplay();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.GDisplay#getCmdDisplay <em>Cmd Display</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd Display</em>' attribute.
   * @see #getCmdDisplay()
   * @generated
   */
  void setCmdDisplay(String value);

  /**
   * Returns the value of the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' containment reference.
   * @see #setVar(EObject)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getGDisplay_Var()
   * @model containment="true"
   * @generated
   */
  EObject getVar();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.GDisplay#getVar <em>Var</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' containment reference.
   * @see #getVar()
   * @generated
   */
  void setVar(EObject value);

} // GDisplay
