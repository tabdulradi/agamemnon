package troy.driver.schema.table

import troy.driver.schema.keyspace.KeyspaceExists
import troy.driver.schema.version.VersionExists

/*
 * Name is expected to be a textual literal type
 * This type-class is meant to be instantiated at the call site (might be auto-generated by a macro/plugin)
 * to give the compiler a hint about the schema
 */
trait TableExists[Version, Keyspace, Name]

object TableExists {
  def instance[V, K, Name](implicit keyspaceExists: KeyspaceExists[V, K]) = new TableExists[V, K, Name] {}
}
