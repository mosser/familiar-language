/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mydsl;

import org.xtext.example.mydsl.FmlStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class FmlStandaloneSetup extends FmlStandaloneSetupGenerated {
  public static void doSetup() {
    FmlStandaloneSetup _fmlStandaloneSetup = new FmlStandaloneSetup();
    _fmlStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}