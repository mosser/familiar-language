/**
 */
package org.xtext.example.mydsl.fML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get FGroups</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.fML.GetFGroups#getKindOfGroups <em>Kind Of Groups</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.fML.GetFGroups#getFm <em>Fm</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.fML.FMLPackage#getGetFGroups()
 * @model
 * @generated
 */
public interface GetFGroups extends Command, SetCommand
{
  /**
   * Returns the value of the '<em><b>Kind Of Groups</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.fML.KindOfGetGroups}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind Of Groups</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind Of Groups</em>' attribute.
   * @see org.xtext.example.mydsl.fML.KindOfGetGroups
   * @see #setKindOfGroups(KindOfGetGroups)
   * @see org.xtext.example.mydsl.fML.FMLPackage#getGetFGroups_KindOfGroups()
   * @model
   * @generated
   */
  KindOfGetGroups getKindOfGroups();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.GetFGroups#getKindOfGroups <em>Kind Of Groups</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind Of Groups</em>' attribute.
   * @see org.xtext.example.mydsl.fML.KindOfGetGroups
   * @see #getKindOfGroups()
   * @generated
   */
  void setKindOfGroups(KindOfGetGroups value);

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
   * @see org.xtext.example.mydsl.fML.FMLPackage#getGetFGroups_Fm()
   * @model containment="true"
   * @generated
   */
  FMCommand getFm();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.fML.GetFGroups#getFm <em>Fm</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fm</em>' containment reference.
   * @see #getFm()
   * @generated
   */
  void setFm(FMCommand value);

} // GetFGroups
