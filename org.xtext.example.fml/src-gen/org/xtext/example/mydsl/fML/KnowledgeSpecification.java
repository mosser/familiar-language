/**
 */
package org.xtext.example.mydsl.fML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knowledge Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.KnowledgeSpecification#getHierarchy <em>Hierarchy</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.KnowledgeSpecification#getGroups <em>Groups</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.KnowledgeSpecification#getConstraints <em>Constraints</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getKnowledgeSpecification()
 * @model
 * @generated
 */
public interface KnowledgeSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Hierarchy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hierarchy</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hierarchy</em>' containment reference.
   * @see #setHierarchy(HierarchySpecification)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getKnowledgeSpecification_Hierarchy()
   * @model containment="true"
   * @generated
   */
  HierarchySpecification getHierarchy();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.KnowledgeSpecification#getHierarchy <em>Hierarchy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hierarchy</em>' containment reference.
   * @see #getHierarchy()
   * @generated
   */
  void setHierarchy(HierarchySpecification value);

  /**
   * Returns the value of the '<em><b>Groups</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groups</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groups</em>' containment reference.
   * @see #setGroups(GroupsSpecification)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getKnowledgeSpecification_Groups()
   * @model containment="true"
   * @generated
   */
  GroupsSpecification getGroups();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.KnowledgeSpecification#getGroups <em>Groups</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Groups</em>' containment reference.
   * @see #getGroups()
   * @generated
   */
  void setGroups(GroupsSpecification value);

  /**
   * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraints</em>' containment reference.
   * @see #setConstraints(ConstraintsSpecification)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getKnowledgeSpecification_Constraints()
   * @model containment="true"
   * @generated
   */
  ConstraintsSpecification getConstraints();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.KnowledgeSpecification#getConstraints <em>Constraints</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraints</em>' containment reference.
   * @see #getConstraints()
   * @generated
   */
  void setConstraints(ConstraintsSpecification value);

} // KnowledgeSpecification