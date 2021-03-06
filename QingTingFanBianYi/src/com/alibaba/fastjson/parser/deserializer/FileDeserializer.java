package com.alibaba.fastjson.parser.deserializer;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import java.io.File;
import java.lang.reflect.Type;

public class FileDeserializer
  implements ObjectDeserializer
{
  public static final FileDeserializer instance = new FileDeserializer();

  public <T> T deserialze(DefaultJSONParser paramDefaultJSONParser, Type paramType, Object paramObject)
  {
    paramDefaultJSONParser = paramDefaultJSONParser.parse();
    if (paramDefaultJSONParser == null)
      return null;
    return new File((String)paramDefaultJSONParser);
  }

  public int getFastMatchToken()
  {
    return 4;
  }
}

/* Location:           C:\Users\User\dex2jar-2.0\dex\qting\classes-dex2jar.jar
 * Qualified Name:     com.alibaba.fastjson.parser.deserializer.FileDeserializer
 * JD-Core Version:    0.6.2
 */