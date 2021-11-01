package com.github.therycn.tyleaguedatarest.graphql.exception;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class LeagueAlreadyExistsException extends RuntimeException implements GraphQLError {

    private String name;

    private int season;

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return null;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return Map.of("name", name, "season", season);
    }
}
