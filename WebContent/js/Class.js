Class =
{
	/**
	 * Create a new class. Execute initialize() method.
	 * @return {Object} created object
	 * @memberOf actuate.Class
	 */
	create : function( newPrototype )
	{
		var aClass = function( )
		{
			if( this.initialize == undefined )
			{
				this.initialize = function( ){ };
			}
			
			this.initialize.apply( this, arguments );
		};
		
		aClass._instanceCount = -1;
		return aClass;
	},

	/**
	 * Extend class.
	 * @param {Object} destination to be extended
	 * @param {Object} source extending from
	 * @return {Object} extended object
	 * @memberOf actuate.Class
	 */
	extend : function( destination, source )
	{
		for( property in source )
		{
			destination[property] = source[property];
		}
		return destination;
	},

	
	/**
	 * Create a new class. Execute initialize() method.
	 * @param {Object} newProto prototype for the new class
	 * @return {Object} created object
	 * @memberOf actuate.Class
	 */
	createClass : function( newPrototype )
	{
		var aClass = function( )
		{
			if( this.initialize == undefined )
			{
				this.initialize = function( ){ };
			}
			
			this.initialize.apply( this, arguments );
		};
		
		if ( newPrototype )
		{
			aClass.prototype = newPrototype;
		}
		
		aClass._instanceCount = -1;
		
		return aClass;
	},
	
	/**
	 * Create a new class based on the given class and prototype.
	 * @param {Class} baseClass reference to the base class object
	 * @param {Object} newProto prototype for the extended class
	 */
	extendClass : function( baseClass, newProto )
	{
		var aClass = actuate.Class.create();
		aClass.superclass = baseClass.prototype;
		baseClass.prototype.__extending = true;
		aClass.prototype = actuate.Class.extend( new baseClass(), newProto );
		delete baseClass.prototype.__extending;
		return aClass;
	}
};