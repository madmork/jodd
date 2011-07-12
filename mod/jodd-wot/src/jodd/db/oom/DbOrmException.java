// Copyright (c) 2003-2011, Jodd Team (jodd.org). All Rights Reserved.

package jodd.db.oom;

import jodd.db.DbSqlException;

/**
 * DbOrm exceptions.
 */
public class DbOrmException extends DbSqlException {

	public DbOrmException(Throwable t) {
		super(t);
	}

	public DbOrmException() {
	}

	public DbOrmException(String message) {
		super(message);
	}

	public DbOrmException(String message, Throwable t) {
		super(message, t);
	}
}