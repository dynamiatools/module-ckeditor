package tools.dynamia.modules.ckeditor;

import tools.dynamia.zk.BindingComponentIndex;
import tools.dynamia.zk.ComponentAliasIndex;

public class Richeditor extends org.zkforge.ckez.CKeditor {


    static {
        ComponentAliasIndex.getInstance().add(Richeditor.class);
        BindingComponentIndex.getInstance().put("value", Richeditor.class);
    }


}
