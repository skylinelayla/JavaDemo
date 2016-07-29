import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.*;
import javax.naming.ldap.LdapContext;
import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;

/**
 * Created by SHIKUN on 2016/7/28.
 */
public class ConnectAd {

    public static void main(String[] args) {
        String username="cn=admin,dc=ldap,dc=eorionx,dc=com";
        String host="ldap://211.144.85.190:30389";
        String password="openldap_dev@2016";

        connect(host,username,password);

    }
    public static void connect(String host, String username, String password) {
        DirContext ctx=null;
        Hashtable<String, String> HasEnv = new Hashtable<>();
        HasEnv.put(Context.SECURITY_AUTHENTICATION, "simple");
        HasEnv.put(Context.SECURITY_PRINCIPAL, username);
        HasEnv.put(Context.SECURITY_CREDENTIALS, password);
        HasEnv.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
        HasEnv.put(Context.PROVIDER_URL, host);
        try {
            ctx = new InitialDirContext(HasEnv);
            System.out.println("OK");

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

//    public static void querygroup(LdapContext ldapContext) throws Exception {
//
//        SearchControls searchControls = new SearchControls();
//        searchControls.setSearchScope(SearchControls.SUBTREE_SCOPE);
//        String searchFilter = "objectclass=groupOfNames";
//        String searchBase = "dc=group,dc=ldap,dc=eorionx,dc=com";
//        String returnAttr[] = {"dn", "cn", "member"};
//        searchControls.setReturningAttributes(returnAttr);
//        NamingEnumeration<SearchResult> answer = ldapContext.search(searchBase, searchFilter, searchControls);
//
//        while (answer.hasMoreElements()) {
//            SearchResult sr = answer.next();
//            Attributes Attrs = sr.getAttributes();
//            if (Attrs != null) {
//                NamingEnumeration<?> ne = Attrs.getAll();
//                while(ne.hasMore()) {
//                    Attribute Attr = (Attribute)ne.next();
//                    String name = Attr.getID();
//                    Enumeration<?> values = Attr.getAll();
//                    if (values != null) { // 迭代
//                        while (values.hasMoreElements()) {
//                            String value = "";
//                            if("objectGUID".equals(name)) {
//                                value = UUID.nameUUIDFromBytes((byte[]) values.nextElement()).toString();
//                            } else {
//                                value = (String)values.nextElement();
//                            }
//                            System.out.println(name + " " + value);
//                        }
//                    }
//                }
//                System.out.println("=====================");
//
//                Collection
//            }
//        }
//
//    }
}
