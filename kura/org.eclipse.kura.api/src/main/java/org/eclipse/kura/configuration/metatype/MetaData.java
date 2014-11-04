/**
 * Copyright (c) 2011, 2014 Eurotech and/or its affiliates
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Eurotech
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.10.26 at 02:11:54 PM CEST 
//


package org.eclipse.kura.configuration.metatype;

import java.util.List;


/**
 * <p>Java class for Tmetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tmetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OCD" type="{http://www.osgi.org/xmlns/metatype/v1.2.0}Tocd" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Designate" type="{http://www.osgi.org/xmlns/metatype/v1.2.0}Tdesignate" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="localization" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public interface MetaData 
{
    /**
     * Gets the value of the ocd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ocd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOCD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCD }
     * 
     * 
     */
    public List<OCD> getOCD();

    /**
     * Gets the value of the designate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Designate }
     * 
     * 
     */
    public List<Designate> getDesignate();

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalization();
}