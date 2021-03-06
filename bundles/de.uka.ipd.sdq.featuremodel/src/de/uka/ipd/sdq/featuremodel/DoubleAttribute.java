/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.uka.ipd.sdq.featuremodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Double Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.uka.ipd.sdq.featuremodel.DoubleAttribute#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.uka.ipd.sdq.featuremodel.featuremodelPackage#getDoubleAttribute()
 * @model
 * @generated
 */
public interface DoubleAttribute extends Attribute {
	/**
     * Returns the value of the '<em><b>Default Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Default Value</em>' attribute.
     * @see #setDefaultValue(double)
     * @see de.uka.ipd.sdq.featuremodel.featuremodelPackage#getDoubleAttribute_DefaultValue()
     * @model required="true" ordered="false"
     * @generated
     */
	double getDefaultValue();

	/**
     * Sets the value of the '{@link de.uka.ipd.sdq.featuremodel.DoubleAttribute#getDefaultValue <em>Default Value</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Value</em>' attribute.
     * @see #getDefaultValue()
     * @generated
     */
	void setDefaultValue(double value);

} // DoubleAttribute
