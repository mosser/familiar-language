/**
 */
package org.xtext.example.mydsl.fML;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Edit Constant</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.fML.FMLPackage#getEditConstant()
 * @model
 * @generated
 */
public enum EditConstant implements Enumerator
{
  /**
   * The '<em><b>REFACTORING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REFACTORING_VALUE
   * @generated
   * @ordered
   */
  REFACTORING(0, "REFACTORING", "REFACTORING"),

  /**
   * The '<em><b>SPECIALIZATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SPECIALIZATION_VALUE
   * @generated
   * @ordered
   */
  SPECIALIZATION(1, "SPECIALIZATION", "SPECIALIZATION"),

  /**
   * The '<em><b>GENERALIZATION</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GENERALIZATION_VALUE
   * @generated
   * @ordered
   */
  GENERALIZATION(2, "GENERALIZATION", "GENERALIZATION"),

  /**
   * The '<em><b>ARBITRARY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARBITRARY_VALUE
   * @generated
   * @ordered
   */
  ARBITRARY(3, "ARBITRARY", "ARBITRARY");

  /**
   * The '<em><b>REFACTORING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>REFACTORING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #REFACTORING
   * @model
   * @generated
   * @ordered
   */
  public static final int REFACTORING_VALUE = 0;

  /**
   * The '<em><b>SPECIALIZATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SPECIALIZATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SPECIALIZATION
   * @model
   * @generated
   * @ordered
   */
  public static final int SPECIALIZATION_VALUE = 1;

  /**
   * The '<em><b>GENERALIZATION</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>GENERALIZATION</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #GENERALIZATION
   * @model
   * @generated
   * @ordered
   */
  public static final int GENERALIZATION_VALUE = 2;

  /**
   * The '<em><b>ARBITRARY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ARBITRARY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ARBITRARY
   * @model
   * @generated
   * @ordered
   */
  public static final int ARBITRARY_VALUE = 3;

  /**
   * An array of all the '<em><b>Edit Constant</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final EditConstant[] VALUES_ARRAY =
    new EditConstant[]
    {
      REFACTORING,
      SPECIALIZATION,
      GENERALIZATION,
      ARBITRARY,
    };

  /**
   * A public read-only list of all the '<em><b>Edit Constant</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<EditConstant> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Edit Constant</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EditConstant get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EditConstant result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Edit Constant</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EditConstant getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      EditConstant result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Edit Constant</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EditConstant get(int value)
  {
    switch (value)
    {
      case REFACTORING_VALUE: return REFACTORING;
      case SPECIALIZATION_VALUE: return SPECIALIZATION;
      case GENERALIZATION_VALUE: return GENERALIZATION;
      case ARBITRARY_VALUE: return ARBITRARY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EditConstant(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //EditConstant
