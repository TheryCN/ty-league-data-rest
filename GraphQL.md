# GraphQL

Graphql is a database query language.

# Concepts
- Query
- Mutation
- Subscription

# Getting Started
- Maven dependencies (GraphQL + GraphiQL)
- Add graphql schema definition `src/main/resources/graphql`
- Add at least the root query resolver `com.github.therycn.tyleaguedatarest.graphql`

# Query

```
query {
  leagues {
    id, 
    name, 
    season
  }
}

query {
  leagueById(id:2) {
    id, 
    name, 
    season
  }
}

query {
  leagues {
    id,
    name,
    season,
    teams {
      id,
      name
    }
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
- Less code (API Abstraction)
- Decoupling API / Backend
- GraphQL Server with AWS AppSync https://aws.amazon.com/fr/appsync/

# Cons

- More processing server side to parse the request (POST)
- Http caching (i.e. GET queries)
- File upload handling (supported by some libs)
- N+1 queries performances (complex queries)


# References
- https://www.baeldung.com/spring-graphql
- GraphQL Exception handling : https://medium.com/swlh/understanding-graphql-error-handling-mechanisms-in-spring-boot-604301c9bedb