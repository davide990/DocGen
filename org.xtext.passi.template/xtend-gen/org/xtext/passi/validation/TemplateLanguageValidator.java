package org.xtext.passi.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.passi.templateLanguage.Feature;
import org.xtext.passi.templateLanguage.TableData;
import org.xtext.passi.templateLanguage.TableDataAttribute;
import org.xtext.passi.templateLanguage.Template;
import org.xtext.passi.templateLanguage.TemplateLanguagePackage;
import org.xtext.passi.validation.AbstractTemplateLanguageValidator;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class TemplateLanguageValidator extends AbstractTemplateLanguageValidator {
  @Check
  public void checkDuplicateFeature(final Feature f) {
    boolean _or = false;
    String _name = f.getName();
    boolean _equals = _name.equals("excludedEClass");
    if (_equals) {
      _or = true;
    } else {
      String _name_1 = f.getName();
      boolean _equals_1 = _name_1.equals("excludedEStructuralFeature");
      _or = _equals_1;
    }
    if (_or) {
      return;
    }
    String _name_2 = f.getName();
    boolean _equals_2 = _name_2.equals("keyEClass");
    if (_equals_2) {
    }
    String _name_3 = f.getName();
    boolean _equals_3 = _name_3.equals("documentationStyle");
    if (_equals_3) {
    }
    EObject _eContainer = f.eContainer();
    Template _cast = Template.class.cast(_eContainer);
    final EList<Feature> fList = _cast.getFeatures();
    int counter = 0;
    int tableDataCounter = 0;
    for (final Feature feature : fList) {
      {
        if ((feature instanceof TableData)) {
          tableDataCounter = (tableDataCounter + 1);
        }
        String _name_4 = feature.getName();
        String _name_5 = f.getName();
        boolean _equals_4 = _name_4.equals(_name_5);
        if (_equals_4) {
          counter = (counter + 1);
        }
      }
    }
    if ((tableDataCounter > 1)) {
    }
    if ((counter > 1)) {
      String _name_4 = f.getName();
      String _plus = ("Warning: template feature \"" + _name_4);
      String _plus_1 = (_plus + "\" already defined.");
      this.warning(_plus_1, null, TemplateLanguagePackage.FEATURE__NAME);
    }
  }
  
  @Check
  public Object checkDiagramImageIncluded() {
    return null;
  }
  
  @Check
  public String checkTableAttributeQualifiedName(final TableDataAttribute a) {
    String _xblockexpression = null;
    {
      final String attrValue = a.getName();
      InputOutput.<String>println(("attribute value: " + attrValue));
      final String[] attrValueSplitted = attrValue.split("\\.");
      int _length = attrValueSplitted.length;
      String _plus = (Integer.valueOf(_length) + " strings.");
      InputOutput.<String>println(_plus);
      for (final String s : attrValueSplitted) {
        InputOutput.<String>println(("-> " + s));
      }
      _xblockexpression = InputOutput.<String>println("-------------");
    }
    return _xblockexpression;
  }
}
