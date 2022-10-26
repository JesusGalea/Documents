<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
<body>
  <h2><xsl:value-of select="rss/channel/title"/></h2>
 
    <xsl:for-each select="rss/noticias/item">
   
     <h3><xsl:value-of select="title"/> - Autor: <xsl:value-of select="author"/></h3>
      <xsl:value-of select="description"/>
    
    </xsl:for-each>
 
</body>
</html>
</xsl:template>
</xsl:stylesheet>
