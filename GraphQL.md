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
# Pros

- Easy to learn
- Network performance improvements (return only requested fields)
- Less code (type checks, dto)
- Decoupling API / Backend

# Cons

- Not supported by Azure API Management
- Http caching (i.e. GET queries)
- More processing server side to parse the request (POST)

# References
- https://www.baeldung.com/spring-graphql
- GraphQL Exception handling : https://medium.com/swlh/understanding-graphql-error-handling-mechanisms-in-spring-boot-604301c9bedb