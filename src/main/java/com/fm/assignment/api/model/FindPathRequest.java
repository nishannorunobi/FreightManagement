package com.fm.assignment.api.model;

import com.fm.assignment.core.enums.TransportTypeEnum;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Sanjoy Kumer Deb
 * @since 06/10/2017.
 */
@Data
public class FindPathRequest {
    String source;
    String destination;
    List<TransportTypeEnum> modeOfTransports;
    Long containerSize;
    Long durationFrom;
    Long durationTo;
    Double costFrom;
    Double costTo;
}
