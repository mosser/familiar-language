/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constraint Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.ConstraintExpr#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.ConstraintExpr#getFm <em>Fm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getConstraintExpr()
 * @model
 * @generated
 */
public interface ConstraintExpr extends Command, SetCommand
{
  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.fML.CNF}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference list.
   * @see org.xtext.example.mydsl.fML.FMLPackage#getConstraintExpr_Constraints()
   * @model containment="true"
   * @generated
   */
  EList<CNF> getConstraints();

  /**
   * Returns the value of the '<em><b>Fm</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fm</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fm</em>' containment reference.
   * @see #setFm(FMCommand)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getConstraintExpr_Fm()
   * @model containment="true"
   * @generated
   */
  FMCommand getFm();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.ConstraintExpr#getFm <em>Fm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fm</em>' containment reference.
   * @see #getFm()
   * @generated
   */
  void setFm(FMCommand value);

} // ConstraintExpr
