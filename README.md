Strongly-Typed Javascript (STJS) Bridge to Backbone.js
================================

The STJS bridge to Backbone.js gives you access to this great library using a Java syntax. All the functionalities of Backbone.js are available,
but the code has to be written in a slightly different manner compared to the code you would've written directly in JavaScript.

This difference comes mainly from the way inheritance is implemented in Backbone.js (via _.extend of Underscore.js) compared to ST-JS.
In Backbone.js the Views and Models properties are set BEFORE calling the constructor of the object - that afterwards calls the initialize method.

To obtain a similar behavior with ST-JS, when implementing Views you need to:
- override the method _ensureElement and set there the "el" or "tagName" field and then call super._ensureElement
- override the method delegateEvents and set the events map there and then call super.delegateEvents

For Models you always need to override the constructor public Model(Map<String, ? extends Object> attributes, ModelOptions options)
 
 Please leave the constructors of Views and Models empty - use the initialize method instead.
 
 One more matter where you need to be careful is the usage of "$" in Views. $ is a method of the View, so this.$ and $ is the same thing!
 So if you wish to access the global jQuery method, please call GlobalJQuery.$ (or other global object - @GlboalScope - that has this property set).
 
 We're sorry for these limitations, we're working to find a transparent way for you the users. Your suggestions are welcome! 