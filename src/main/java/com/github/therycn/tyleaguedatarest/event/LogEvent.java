package com.github.therycn.tyleaguedatarest.event;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * LogEvent.
 */
@Data
@AllArgsConstructor
public class LogEvent {

    private String message;

    private Date date;
}
