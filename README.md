# ZK CKeditor for DynamiaTools

This module simple integrated CKeditor for ZK to DynamiaTools Apps. 
Provide an alias for ckeditor, form renderer support and databinding improvements.

## Example:

```yml
view: form
beanClass: my.app.BeanClass

fields:
  description:
    component: ckeditor
   
  alternative:
    component: richeditor
```

## Installation
**Maven**
```xml
<dependency>
  <groupId>tools.dynamia.modules</groupId>
  <artifactId>tools.dynamia.modules.ckeditor</artifactId>
  <version>4.20.1.0</version>
</dependency>
```

**Gradle**
```groovy
compile 'tools.dynamia.modules:tools.dynamia.modules.ckeditor:4.20.1.0'
```

