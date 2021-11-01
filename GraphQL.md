# GraphQL

Graphql is a database query language.

# Concepts
- Query
- Resolver
- Mutation
- Subscription

# Getting Started
- Maven dependencies (GraphQL + GraphiQL)
- Add graphql schema definition `src/main/resources/graphql`
- Add at least the root query resolver `com.github.therycn.tyleaguedatarest.graphql`

# Resolver

```
query {
  leagues {
    id, 
    name, 
    season
  }
}
```

# Mutations

```
mutation {
  createLeague(leagueAdd: {name: "League 2", season: 2021, segment: "Summer"}) {
    id,
    name
  }
}
```

# Subscription
# Pros / Cons

# References
- https://www.baeldung.com/spring-graphql
- GraphQL Exception handling : https://medium.com/swlh/understanding-graphql-error-handling-mechanisms-in-spring-boot-604301c9bedb