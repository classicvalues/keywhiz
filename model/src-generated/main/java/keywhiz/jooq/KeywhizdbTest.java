/*
 * This file is generated by jOOQ.
 */
package keywhiz.jooq;


import java.util.Arrays;
import java.util.List;

import keywhiz.jooq.tables.Accessgrants;
import keywhiz.jooq.tables.Clients;
import keywhiz.jooq.tables.Groups;
import keywhiz.jooq.tables.Memberships;
import keywhiz.jooq.tables.SchemaVersion;
import keywhiz.jooq.tables.Secrets;
import keywhiz.jooq.tables.SecretsContent;
import keywhiz.jooq.tables.Users;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KeywhizdbTest extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>keywhizdb_test</code>
     */
    public static final KeywhizdbTest KEYWHIZDB_TEST = new KeywhizdbTest();

    /**
     * The table <code>keywhizdb_test.accessgrants</code>.
     */
    public final Accessgrants ACCESSGRANTS = Accessgrants.ACCESSGRANTS;

    /**
     * The table <code>keywhizdb_test.clients</code>.
     */
    public final Clients CLIENTS = Clients.CLIENTS;

    /**
     * The table <code>keywhizdb_test.groups</code>.
     */
    public final Groups GROUPS = Groups.GROUPS;

    /**
     * The table <code>keywhizdb_test.memberships</code>.
     */
    public final Memberships MEMBERSHIPS = Memberships.MEMBERSHIPS;

    /**
     * The table <code>keywhizdb_test.schema_version</code>.
     */
    public final SchemaVersion SCHEMA_VERSION = SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>keywhizdb_test.secrets</code>.
     */
    public final Secrets SECRETS = Secrets.SECRETS;

    /**
     * The table <code>keywhizdb_test.secrets_content</code>.
     */
    public final SecretsContent SECRETS_CONTENT = SecretsContent.SECRETS_CONTENT;

    /**
     * The table <code>keywhizdb_test.users</code>.
     */
    public final Users USERS = Users.USERS;

    /**
     * No further instances allowed
     */
    private KeywhizdbTest() {
        super("keywhizdb_test", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Accessgrants.ACCESSGRANTS,
            Clients.CLIENTS,
            Groups.GROUPS,
            Memberships.MEMBERSHIPS,
            SchemaVersion.SCHEMA_VERSION,
            Secrets.SECRETS,
            SecretsContent.SECRETS_CONTENT,
            Users.USERS
        );
    }
}