/**
 */
package org.xtext.example.mydsl.fML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GListing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.GListing#getCmd <em>Cmd</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getGListing()
 * @model
 * @generated
 */
public interface GListing extends Command
{
  /**
   * Returns the value of the '<em><b>Cmd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cmd</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cmd</em>' attribute.
   * @see #setCmd(String)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getGListing_Cmd()
   * @model
   * @generated
   */
  String getCmd();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.GListing#getCmd <em>Cmd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cmd</em>' attribute.
   * @see #getCmd()
   * @generated
   */
  void setCmd(String value);

} // GListing
