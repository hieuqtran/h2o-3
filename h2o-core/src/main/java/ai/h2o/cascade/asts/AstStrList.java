package ai.h2o.cascade.asts;

import ai.h2o.cascade.core.Scope;
import ai.h2o.cascade.vals.Val;
import ai.h2o.cascade.vals.ValStrs;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A list of Strings.
 */
public class AstStrList extends AstNode<AstStrList> {
  public String[] strings;

  public AstStrList(ArrayList<String> strs) {
    strings = strs.toArray(new String[strs.size()]);
  }

  @Override
  public Val exec(Scope scope) {
    return new ValStrs(strings);
  }

  @Override
  public String str() {
    return Arrays.toString(strings);
  }

}
