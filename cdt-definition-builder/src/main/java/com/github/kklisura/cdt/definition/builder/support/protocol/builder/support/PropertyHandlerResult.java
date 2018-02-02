package com.github.kklisura.cdt.definition.builder.support.protocol.builder.support;

import com.github.kklisura.cdt.definition.builder.support.java.builder.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * Property handler result.
 *
 * @author Kenan Klisura
 */
@Getter
@Setter
public class PropertyHandlerResult {
  private Builder builder;
  private String type;
}