package usantatecla.mastermind.distributed;

import usantatecla.mastermind.controllers.impl.FrameType;
import usantatecla.mastermind.controllers.impl.LogicImpl;
import usantatecla.mastermind.distributed.dispatchers.*;

class LogicServerImpl extends LogicImpl {

    void associateDispatchers(DispatcherPrototype dispatcherPrototype) {
        dispatcherPrototype.add(FrameType.START, new StartDispatcher(this.startControllerImpl));
        dispatcherPrototype.add(FrameType.ADD_PROPOSAL, new AddProposalDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.GET_RESULT, new ResultDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.GET_PROPOSAL, new GetProposalDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.GET_ATTEMPTS, new AttemptsDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.STATE, new StateDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.UNDO, new UndoDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.REDO, new RedoDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.UNDOABLE, new UndoableDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.REDOABLE, new RedoableDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.WINNER, new WinnerDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.LOOSER, new LooserDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.NEXT_STATE, new NextStateDispatcher(this.proposalControllerImpl));
        dispatcherPrototype.add(FrameType.RESUME, new ResumeDispatcher(this.resumeControllerImpl));
    }

}
